package uk.co.mo.app.mercury.cs.entity;

import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import uk.co.mo.app.mercury.cs.util.SystemUtils;

@Aspect
public class EntityAuditAspect {
	private static Log LOG = LogFactory.getLog(EntityAuditAspect.class);

	@Before("execution(* uk.co.mo.app.mercury..*Entity.persist())")
	public void setDates(JoinPoint jp) throws Throwable{
        cascade(jp, AuditTypes.AUDIT_CREATE);
    }

    @Before("execution(* uk.co.mo.app.mercury..*Entity.merge())")
	public void setUpdates(JoinPoint jp) throws Throwable{
    	cascade(jp, AuditTypes.AUDIT_UPDATE);
	}

    private void cascade(JoinPoint jp, AuditTypes auditTypes) {
        if(jp.getTarget() instanceof AbstractAuditableEntity) {
            AbstractAuditableEntity audit = (AbstractAuditableEntity) jp.getTarget();
            audit.audit(auditTypes);
        }
    }

    @Before(value = "execution(* uk.co.mo.app.mercury..*Entity.audit(..)) && args(auditTypes)", argNames = "jp,auditTypes")
	public void setAuditDates(JoinPoint jp, AuditTypes auditTypes) throws Throwable{
    	if(auditTypes.equals(AuditTypes.AUDIT_CREATE)) {
            injectCreateDates(jp);
            injectUpdateDates(jp);
        } else if(auditTypes.equals(AuditTypes.AUDIT_UPDATE)){
            injectUpdateDates(jp);
        }
	}

    private void injectCreateDates(JoinPoint jp) {
        LOG.debug("AutoPopulate Advice Called for set create dates on "+jp.getTarget().getClass().getName());

        try{
            Method method = jp.getTarget().getClass().getMethod("setInsertDate", Date.class);
            method.invoke(jp.getTarget(), new Date());
        }catch(Exception e){
            LOG.debug("Could not invoke setInsertDate method on "+jp.getClass().getName()+e.getMessage());
        }

        try{
            Method method = jp.getTarget().getClass().getMethod("setInsertUser", String.class);
            method.invoke(jp.getTarget(), SystemUtils.getUsername());
        }catch(Exception e){
            LOG.debug("Could not invoke setInsertUser method on "+jp.getClass().getName()+e.getMessage());
        }

        try{
			Method method = jp.getTarget().getClass().getMethod("setHostName", String.class);
			method.invoke(jp.getTarget(), SystemUtils.getHostname());
		}catch(Exception e){
			LOG.debug("Could not invoke setInsertUser method on "+jp.getClass().getName()+e.getMessage());
		}
    }

    private void injectUpdateDates(JoinPoint jp) {
        LOG.debug("AutoPopulate Advice set dates for update called on "+jp.getTarget().getClass().getName());

        try{
            Method method = jp.getTarget().getClass().getMethod("setUpdateDate", Date.class);
            method.invoke(jp.getTarget(), new Date());
        }catch(Exception e){
            LOG.debug("Could not invoke setUpdateDate method on "+jp.getClass().getName()+e.getMessage());
        }

        try{
            Method method = jp.getTarget().getClass().getMethod("setUpdateUser", String.class);
            method.invoke(jp.getTarget(), SystemUtils.getUsername());
        }catch(Exception e){
            LOG.debug("Could not invoke setUpdateUser method on "+jp.getClass().getName()+e.getMessage());
        }
    }
}
