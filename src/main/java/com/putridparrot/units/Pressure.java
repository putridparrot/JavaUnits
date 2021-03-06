// <auto-generated>
// This code was generated by the UnitCodeGenerator tool
//
// Changes to this file will be lost if the code is regenerated
// </auto-generated>

package com.putridparrot.units;

/**
 * Pressure conversion functions
 */
public final class Pressure {
	/**
	 * Atmospheres conversion functions
	 */
	public static class Atmospheres {
		/**
		 * Converts the supplied Atmospheres value to Bars
		 * @param value The Atmospheres input value
		 * @return The value in Bars
		 */
		public static double toBars(double value) {
			return value * 1.01325;
		}
		/**
		 * Converts the supplied Atmospheres value to Pascals
		 * @param value The Atmospheres input value
		 * @return The value in Pascals
		 */
		public static double toPascals(double value) {
			return value * 101325.0;
		}
		/**
		 * Converts the supplied Atmospheres value to Torrs
		 * @param value The Atmospheres input value
		 * @return The value in Torrs
		 */
		public static double toTorrs(double value) {
			return value * 760.0;
		}
		/**
		 * Converts the supplied Atmospheres value to Psi
		 * @param value The Atmospheres input value
		 * @return The value in Psi
		 */
		public static double toPsi(double value) {
			return value * 14.69596432068;
		}
	}
	/**
	 * Bars conversion functions
	 */
	public static class Bars {
		/**
		 * Converts the supplied Bars value to Atmospheres
		 * @param value The Bars input value
		 * @return The value in Atmospheres
		 */
		public static double toAtmospheres(double value) {
			return value / 1.01325;
		}
		/**
		 * Converts the supplied Bars value to Pascals
		 * @param value The Bars input value
		 * @return The value in Pascals
		 */
		public static double toPascals(double value) {
			return value / 0.00001;
		}
		/**
		 * Converts the supplied Bars value to Torrs
		 * @param value The Bars input value
		 * @return The value in Torrs
		 */
		public static double toTorrs(double value) {
			return value * 750.0616827042;
		}
		/**
		 * Converts the supplied Bars value to Psi
		 * @param value The Bars input value
		 * @return The value in Psi
		 */
		public static double toPsi(double value) {
			return value * 14.50378911491;
		}
	}
	/**
	 * Pascals conversion functions
	 */
	public static class Pascals {
		/**
		 * Converts the supplied Pascals value to Atmospheres
		 * @param value The Pascals input value
		 * @return The value in Atmospheres
		 */
		public static double toAtmospheres(double value) {
			return value / 101325.0;
		}
		/**
		 * Converts the supplied Pascals value to Bars
		 * @param value The Pascals input value
		 * @return The value in Bars
		 */
		public static double toBars(double value) {
			return value * 0.00001;
		}
		/**
		 * Converts the supplied Pascals value to Torrs
		 * @param value The Pascals input value
		 * @return The value in Torrs
		 */
		public static double toTorrs(double value) {
			return value * 0.007500616827042;
		}
		/**
		 * Converts the supplied Pascals value to Psi
		 * @param value The Pascals input value
		 * @return The value in Psi
		 */
		public static double toPsi(double value) {
			return value * 0.0001450378911491;
		}
	}
	/**
	 * Psi conversion functions
	 */
	public static class Psi {
		/**
		 * Converts the supplied Psi value to Bars
		 * @param value The Psi input value
		 * @return The value in Bars
		 */
		public static double toBars(double value) {
			return value / 14.50378911491;
		}
		/**
		 * Converts the supplied Psi value to Pascals
		 * @param value The Psi input value
		 * @return The value in Pascals
		 */
		public static double toPascals(double value) {
			return value / 0.0001450378911491;
		}
		/**
		 * Converts the supplied Psi value to Atmospheres
		 * @param value The Psi input value
		 * @return The value in Atmospheres
		 */
		public static double toAtmospheres(double value) {
			return value / 14.69596432068;
		}
		/**
		 * Converts the supplied Psi value to Torrs
		 * @param value The Psi input value
		 * @return The value in Torrs
		 */
		public static double toTorrs(double value) {
			return value / 0.01933679515879;
		}
	}
	/**
	 * Torrs conversion functions
	 */
	public static class Torrs {
		/**
		 * Converts the supplied Torrs value to Bars
		 * @param value The Torrs input value
		 * @return The value in Bars
		 */
		public static double toBars(double value) {
			return value / 750.0616827042;
		}
		/**
		 * Converts the supplied Torrs value to Pascals
		 * @param value The Torrs input value
		 * @return The value in Pascals
		 */
		public static double toPascals(double value) {
			return value / 0.007500616827042;
		}
		/**
		 * Converts the supplied Torrs value to Atmospheres
		 * @param value The Torrs input value
		 * @return The value in Atmospheres
		 */
		public static double toAtmospheres(double value) {
			return value / 760.0;
		}
		/**
		 * Converts the supplied Torrs value to Psi
		 * @param value The Torrs input value
		 * @return The value in Psi
		 */
		public static double toPsi(double value) {
			return value * 0.01933679515879;
		}
	}
}
