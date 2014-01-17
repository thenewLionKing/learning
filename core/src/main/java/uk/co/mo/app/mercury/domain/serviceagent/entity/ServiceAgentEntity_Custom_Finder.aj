/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.serviceagent.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect ServiceAgentEntity_Custom_Finder {

	public static Query ServiceAgentEntity.findActiveServiceAgentByAgentNumber(String agentNumber) {
		if (agentNumber == null)
			throw new IllegalArgumentException("The agent number argument is required");
		StringBuffer queryStr = new StringBuffer();

//		queryStr.append("SELECT sae.transleaseRepairerNumber, sae.transleaseLeasecoRef, sae.leasecoRepairerRef, sae.transmissionAction ");
		queryStr.append("SELECT sae ");
		queryStr.append("FROM ServiceAgentEntity sae left join sae.agentBandRating ar ");
		queryStr.append("WHERE ");
		queryStr.append("sae.leasecoRepairerRef = :agentNumber ");
		queryStr.append("AND ");
		queryStr.append("sae.transmissionAction != :inactiveStatus ");
		queryStr.append("AND ");
		queryStr.append("ar.transmissionAction != :inactiveStatus ");
		queryStr.append("ORDER BY sae.transleaseRepairerNumber DESC");

		EntityManager em = ServiceAgentEntity.entityManager();
		Query q = em.createQuery( queryStr.toString() );
		q.setParameter("agentNumber", agentNumber);
		q.setParameter("inactiveStatus", "D");
		return q;
	}
}
