/*
 * This file is part of CRISIS, an economics simulator.
 * 
 * Copyright (C) 2015 John Kieran Phillips
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
package eu.crisis_economics.abm.contracts.loans;

/**
  * @author phillips
  *
  */
interface DefaultScheme {
   /** 
     * Respond to a loan default. The boolean return value
     * of this method indicates whether the underlying loan
     * contract (subject to a default) should be terminated
     * or retained. If the return value is False, the
     * underlying loan contact cannot be saved by the 
     * resolution technique used.
     */
   public boolean applyDefaultResolution(
      Loan loan,
      Borrower borrower,
      Lender lender,
      double expectedRepaymentDue,
      double actualRepaumentMade
      );
}
