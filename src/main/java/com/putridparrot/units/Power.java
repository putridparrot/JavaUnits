// <auto-generated>
// This code was generated by the UnitCodeGenerator tool
//
// Changes to this file will be lost if the code is regenerated
// </auto-generated>

package com.putridparrot.units;

/**
 * Power conversion functions
 */
public final class Power {
	/**
	 * Mechanical Horse Power conversion functions
	 */
	public static class MechanicalHorsePower {
		/**
		 * Converts the supplied Mechanical Horse Power value to Metric Horse Power
		 * @param value The Mechanical Horse Power input value
		 * @return The value in Metric Horse Power
		 */
		public static double toMetricHorsePower(double value) {
			return value * 1.013869665424;
		}
	}
	/**
	 * Metric Horse Power conversion functions
	 */
	public static class MetricHorsePower {
		/**
		 * Converts the supplied Metric Horse Power value to Mechanical Horse Power
		 * @param value The Metric Horse Power input value
		 * @return The value in Mechanical Horse Power
		 */
		public static double toMechanicalHorsePower(double value) {
			return value / 1.013869665424;
		}
	}
}
