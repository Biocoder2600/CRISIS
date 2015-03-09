/*
 * This file is part of CRISIS, an economics simulator.
 * 
 * Copyright (C) 2015 AITIA International, Inc.
 * 
 * CRISIS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CRISIS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CRISIS.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.crisis_economics.abm.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;

/**
 * @author Tamás Máhr
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Collect {
	
	/**
	 * Denotes the kind of reports collected by the annotated field or method.
	 * 
	 * @author Tamás Máhr
	 *
	 */
	public enum ChangeType {
		/**
		 * Denotes changes of fields and return values of methods annotated as {@link Report}.
		 */
		CHANGE,
		/**
		 * Denotes additions in {@link Collection} type fields annotated as {@link Report}. 
		 */
		COLLECTION_ADD,
		/**
		 * Denotes removals in {@link Collection} type fields annotated as {@link Report}.
		 */
		COLLECTION_REMOVE,
		
		/**
		 * Denotes any kind of reports.
		 */
		ANY
	}
	
	String value();
	
	ChangeType[] changeType() default Collect.ChangeType.ANY;
}
