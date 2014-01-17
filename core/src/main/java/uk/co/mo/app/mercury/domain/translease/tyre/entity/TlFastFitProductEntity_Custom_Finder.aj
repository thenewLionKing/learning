/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.translease.tyre.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect TlFastFitProductEntity_Custom_Finder {

	public static Query TlFastFitProductEntity.findByProductCode(String productCode) {
		if (productCode == null || "".equals( productCode ) )
			throw new IllegalArgumentException("The product code is required");
		StringBuffer queryStr = new StringBuffer();

		queryStr.append("SELECT tffpe ");
		queryStr.append("FROM TlFastFitProductEntity tffpe ");
		queryStr.append("WHERE ");
		queryStr.append("tffpe.productCode = :productCode ");

		EntityManager em = TlFastFitProductEntity.entityManager();
		Query q = em.createQuery( queryStr.toString() );
		q.setParameter("productCode", productCode);

		return q;
	}
}
