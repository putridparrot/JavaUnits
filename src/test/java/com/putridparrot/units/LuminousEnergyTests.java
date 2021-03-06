// <auto-generated>
// This code was generated by the UnitCodeGenerator tool
//
// Changes to this file will be lost if the code is regenerated
// </auto-generated>

package com.putridparrot.units;

import net.jqwik.api.constraints.DoubleRange;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import net.jqwik.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LuminousEnergyTests {
	@Property(tries = 100)
	public void testFromLumenHourToTalbotAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenHour.toTalbot(value);
		final double convertBack = LuminousEnergy.Talbot.toLumenHour(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "9.0,32400.0","1.2,4320.0","4.0,14400.0" })
	public void testConvertKnownLumenHourToTalbot(double input, double expectation) {
		final double result = LuminousEnergy.LumenHour.toTalbot(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromLumenHourToLumenMinuteAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenHour.toLumenMinute(value);
		final double convertBack = LuminousEnergy.LumenMinute.toLumenHour(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "1.2,72.0","0.8,48.0","109.00,6540.0" })
	public void testConvertKnownLumenHourToLumenMinute(double input, double expectation) {
		final double result = LuminousEnergy.LumenHour.toLumenMinute(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromLumenHourToLumenSecondAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenHour.toLumenSecond(value);
		final double convertBack = LuminousEnergy.LumenSecond.toLumenHour(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "109.0,392400.0","6.1,21960.0","0.7,2520.0" })
	public void testConvertKnownLumenHourToLumenSecond(double input, double expectation) {
		final double result = LuminousEnergy.LumenHour.toLumenSecond(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromLumenMinuteToTalbotAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenMinute.toTalbot(value);
		final double convertBack = LuminousEnergy.Talbot.toLumenMinute(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "0.7,42.0","678.0,40680.0","89.0,5340.0" })
	public void testConvertKnownLumenMinuteToTalbot(double input, double expectation) {
		final double result = LuminousEnergy.LumenMinute.toTalbot(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromLumenMinuteToLumenHourAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenMinute.toLumenHour(value);
		final double convertBack = LuminousEnergy.LumenHour.toLumenMinute(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "89.0,1.4833","9.0,0.15","0.123,0.00205" })
	public void testConvertKnownLumenMinuteToLumenHour(double input, double expectation) {
		final double result = LuminousEnergy.LumenMinute.toLumenHour(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromLumenMinuteToLumenSecondAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenMinute.toLumenSecond(value);
		final double convertBack = LuminousEnergy.LumenSecond.toLumenMinute(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "0.123,7.38","8000.0,480000.0","34.1,2046.0" })
	public void testConvertKnownLumenMinuteToLumenSecond(double input, double expectation) {
		final double result = LuminousEnergy.LumenMinute.toLumenSecond(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromLumenSecondToTalbotAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenSecond.toTalbot(value);
		final double convertBack = LuminousEnergy.Talbot.toLumenSecond(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "190.0,190.0","0.6,0.6","5000.0,5000.0" })
	public void testConvertKnownLumenSecondToTalbot(double input, double expectation) {
		final double result = LuminousEnergy.LumenSecond.toTalbot(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromLumenSecondToLumenHourAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenSecond.toLumenHour(value);
		final double convertBack = LuminousEnergy.LumenHour.toLumenSecond(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "190.0,0.052778","200600.0,55.7222","1234.0,0.342778" })
	public void testConvertKnownLumenSecondToLumenHour(double input, double expectation) {
		final double result = LuminousEnergy.LumenSecond.toLumenHour(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromLumenSecondToLumenMinuteAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.LumenSecond.toLumenMinute(value);
		final double convertBack = LuminousEnergy.LumenMinute.toLumenSecond(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "10900.0,181.6667","50.3,0.83833","276.0,4.6" })
	public void testConvertKnownLumenSecondToLumenMinute(double input, double expectation) {
		final double result = LuminousEnergy.LumenSecond.toLumenMinute(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromTalbotToLumenSecondAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.Talbot.toLumenSecond(value);
		final double convertBack = LuminousEnergy.LumenSecond.toTalbot(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "100.0,100.0","0.9,0.9","23.1,23.1" })
	public void testConvertKnownTalbotToLumenSecond(double input, double expectation) {
		final double result = LuminousEnergy.Talbot.toLumenSecond(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromTalbotToLumenHourAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.Talbot.toLumenHour(value);
		final double convertBack = LuminousEnergy.LumenHour.toTalbot(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "800.0,0.222","6789.0,1.885833","10900.0,3.027778" })
	public void testConvertKnownTalbotToLumenHour(double input, double expectation) {
		final double result = LuminousEnergy.Talbot.toLumenHour(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromTalbotToLumenMinuteAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = LuminousEnergy.Talbot.toLumenMinute(value);
		final double convertBack = LuminousEnergy.LumenMinute.toTalbot(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "900.0,15.0","78.9,1.315","1500.0,25.0" })
	public void testConvertKnownTalbotToLumenMinute(double input, double expectation) {
		final double result = LuminousEnergy.Talbot.toLumenMinute(input);
		assertEquals(expectation, result, 0.01);
	}

}
