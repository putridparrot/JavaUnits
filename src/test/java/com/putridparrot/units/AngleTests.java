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

public class AngleTests {
	@Property(tries = 100)
	public void testFromDegreesToRadiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Degrees.toRadians(value);
		final double convertBack = Angle.Radians.toDegrees(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "98.8,1.724385","8000.0,139.6263","8.0,0.139626" })
	public void testConvertKnownDegreesToRadians(double input, double expectation) {
		final double result = Angle.Degrees.toRadians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromDegreesToGradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Degrees.toGradians(value);
		final double convertBack = Angle.Gradians.toDegrees(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "123.0,136.667","65.0,72.2222","900.0,1000.0" })
	public void testConvertKnownDegreesToGradians(double input, double expectation) {
		final double result = Angle.Degrees.toGradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromDegreesToMilliradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Degrees.toMilliradians(value);
		final double convertBack = Angle.Milliradians.toDegrees(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "900.0,15707.969","76.0,1326.45","4.5,78.5398","23333.11,407239.5873" })
	public void testConvertKnownDegreesToMilliradians(double input, double expectation) {
		final double result = Angle.Degrees.toMilliradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromDegreesToMinuteOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Degrees.toMinuteOfArc(value);
		final double convertBack = Angle.MinuteOfArc.toDegrees(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "97.0,5820.0","8.65,519.0","12.0,720.0" })
	public void testConvertKnownDegreesToMinuteOfArc(double input, double expectation) {
		final double result = Angle.Degrees.toMinuteOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromDegreesToSecondsOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Degrees.toSecondsOfArc(value);
		final double convertBack = Angle.SecondsOfArc.toDegrees(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "12.0,43200.0","910.4,3277440.0","5.6,20160.0" })
	public void testConvertKnownDegreesToSecondsOfArc(double input, double expectation) {
		final double result = Angle.Degrees.toSecondsOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromGradiansToDegreesAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Gradians.toDegrees(value);
		final double convertBack = Angle.Degrees.toGradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "5.6,5.04","167.0,150.3","0.1,0.09" })
	public void testConvertKnownGradiansToDegrees(double input, double expectation) {
		final double result = Angle.Gradians.toDegrees(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromGradiansToRadiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Gradians.toRadians(value);
		final double convertBack = Angle.Radians.toGradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "67.9,1.066571","8000.0,125.6637","6.5,0.102102" })
	public void testConvertKnownGradiansToRadians(double input, double expectation) {
		final double result = Angle.Gradians.toRadians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromGradiansToMilliradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Gradians.toMilliradians(value);
		final double convertBack = Angle.Milliradians.toGradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "8.1,127.2348","900.0,14137.167","1902.5,29884.4" })
	public void testConvertKnownGradiansToMilliradians(double input, double expectation) {
		final double result = Angle.Gradians.toMilliradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromGradiansToMinuteOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Gradians.toMinuteOfArc(value);
		final double convertBack = Angle.MinuteOfArc.toGradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "80.9,4368.6","1678.0,90612.0","900.0,48600.0" })
	public void testConvertKnownGradiansToMinuteOfArc(double input, double expectation) {
		final double result = Angle.Gradians.toMinuteOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromGradiansToSecondsOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Gradians.toSecondsOfArc(value);
		final double convertBack = Angle.SecondsOfArc.toGradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "0.9,2916.0","12.3,39852.0","5.1,16524.0" })
	public void testConvertKnownGradiansToSecondsOfArc(double input, double expectation) {
		final double result = Angle.Gradians.toSecondsOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMilliradiansToDegreesAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Milliradians.toDegrees(value);
		final double convertBack = Angle.Degrees.toMilliradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "5.9,0.338045","109.0,6.24524","7009.0,401.5861","407239.5873,23333.11" })
	public void testConvertKnownMilliradiansToDegrees(double input, double expectation) {
		final double result = Angle.Milliradians.toDegrees(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMilliradiansToRadiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Milliradians.toRadians(value);
		final double convertBack = Angle.Radians.toMilliradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "8011.0,8.011","7689.0,7.689","129.0,0.129" })
	public void testConvertKnownMilliradiansToRadians(double input, double expectation) {
		final double result = Angle.Milliradians.toRadians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMilliradiansToGradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Milliradians.toGradians(value);
		final double convertBack = Angle.Gradians.toMilliradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "129.0,8.2124","800.0,50.9296","12.89,0.8206029" })
	public void testConvertKnownMilliradiansToGradians(double input, double expectation) {
		final double result = Angle.Milliradians.toGradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMilliradiansToMinuteOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Milliradians.toMinuteOfArc(value);
		final double convertBack = Angle.MinuteOfArc.toMilliradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "12.0,41.253","0.9,3.09397","800.0,2750.2" })
	public void testConvertKnownMilliradiansToMinuteOfArc(double input, double expectation) {
		final double result = Angle.Milliradians.toMinuteOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMilliradiansToSecondsOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Milliradians.toSecondsOfArc(value);
		final double convertBack = Angle.SecondsOfArc.toMilliradians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "67.0,13819.742","900.0,185638.32562238674","812.5,167590.16" })
	public void testConvertKnownMilliradiansToSecondsOfArc(double input, double expectation) {
		final double result = Angle.Milliradians.toSecondsOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMinuteOfArcToDegreesAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.MinuteOfArc.toDegrees(value);
		final double convertBack = Angle.Degrees.toMinuteOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "89.0,1.48333","160.5,2.675","0.9,0.015" })
	public void testConvertKnownMinuteOfArcToDegrees(double input, double expectation) {
		final double result = Angle.MinuteOfArc.toDegrees(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMinuteOfArcToRadiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.MinuteOfArc.toRadians(value);
		final double convertBack = Angle.Radians.toMinuteOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "1790.0,0.5206899","9999.0,2.908591","12345.0,3.5910149" })
	public void testConvertKnownMinuteOfArcToRadians(double input, double expectation) {
		final double result = Angle.MinuteOfArc.toRadians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMinuteOfArcToGradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.MinuteOfArc.toGradians(value);
		final double convertBack = Angle.Gradians.toMinuteOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "300.0,5.55556","1009.0,18.68519","6700.5,124.083335" })
	public void testConvertKnownMinuteOfArcToGradians(double input, double expectation) {
		final double result = Angle.MinuteOfArc.toGradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMinuteOfArcToMilliradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.MinuteOfArc.toMilliradians(value);
		final double convertBack = Angle.Milliradians.toMinuteOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "600.0,174.533","90.7,26.38356","1700.0,494.51" })
	public void testConvertKnownMinuteOfArcToMilliradians(double input, double expectation) {
		final double result = Angle.MinuteOfArc.toMilliradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromMinuteOfArcToSecondsOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.MinuteOfArc.toSecondsOfArc(value);
		final double convertBack = Angle.SecondsOfArc.toMinuteOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "0.9,54.0","70.0,4200.0","901.6,54096.0" })
	public void testConvertKnownMinuteOfArcToSecondsOfArc(double input, double expectation) {
		final double result = Angle.MinuteOfArc.toSecondsOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromRadiansToDegreesAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Radians.toDegrees(value);
		final double convertBack = Angle.Degrees.toRadians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "4.5,257.831","0.9,51.5662","78.9,4520.637" })
	public void testConvertKnownRadiansToDegrees(double input, double expectation) {
		final double result = Angle.Radians.toDegrees(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromRadiansToGradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Radians.toGradians(value);
		final double convertBack = Angle.Gradians.toRadians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "5.0,318.31","0.9,57.2958","89.0,5665.92" })
	public void testConvertKnownRadiansToGradians(double input, double expectation) {
		final double result = Angle.Radians.toGradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromRadiansToMilliradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Radians.toMilliradians(value);
		final double convertBack = Angle.Milliradians.toRadians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "5.0,5000.0","0.13,130.0","0.13,130.0","89.1,89100.0" })
	public void testConvertKnownRadiansToMilliradians(double input, double expectation) {
		final double result = Angle.Radians.toMilliradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromRadiansToMinuteOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Radians.toMinuteOfArc(value);
		final double convertBack = Angle.MinuteOfArc.toRadians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "6.0,20626.480624709635","0.8,2750.2","2.3,7906.82" })
	public void testConvertKnownRadiansToMinuteOfArc(double input, double expectation) {
		final double result = Angle.Radians.toMinuteOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromRadiansToSecondsOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.Radians.toSecondsOfArc(value);
		final double convertBack = Angle.SecondsOfArc.toRadians(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "0.8,165011.84499767708","0.001,206.26481","0.9,185638.32562238674" })
	public void testConvertKnownRadiansToSecondsOfArc(double input, double expectation) {
		final double result = Angle.Radians.toSecondsOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromSecondsOfArcToDegreesAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.SecondsOfArc.toDegrees(value);
		final double convertBack = Angle.Degrees.toSecondsOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "900.0,0.25","123.4,0.034277778","8000.0,2.222222" })
	public void testConvertKnownSecondsOfArcToDegrees(double input, double expectation) {
		final double result = Angle.SecondsOfArc.toDegrees(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromSecondsOfArcToRadiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.SecondsOfArc.toRadians(value);
		final double convertBack = Angle.Radians.toSecondsOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "190000.0,0.921145994","88990.0,0.43143569","100000.0,0.48481368" })
	public void testConvertKnownSecondsOfArcToRadians(double input, double expectation) {
		final double result = Angle.SecondsOfArc.toRadians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromSecondsOfArcToGradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.SecondsOfArc.toGradians(value);
		final double convertBack = Angle.Gradians.toSecondsOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "1000.0,0.308642","809.0,0.249691","1567.9,0.483919761" })
	public void testConvertKnownSecondsOfArcToGradians(double input, double expectation) {
		final double result = Angle.SecondsOfArc.toGradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromSecondsOfArcToMilliradiansAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.SecondsOfArc.toMilliradians(value);
		final double convertBack = Angle.Milliradians.toSecondsOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "1234.0,5.982601","909.0,4.40696","190009.0,921.189627" })
	public void testConvertKnownSecondsOfArcToMilliradians(double input, double expectation) {
		final double result = Angle.SecondsOfArc.toMilliradians(input);
		assertEquals(expectation, result, 0.01);
	}

	@Property(tries = 100)
	public void testFromSecondsOfArcToMinuteOfArcAndBack(@ForAll @DoubleRange(min = -1E12, max = 1E12) double value) {
		final double convertTo = Angle.SecondsOfArc.toMinuteOfArc(value);
		final double convertBack = Angle.MinuteOfArc.toSecondsOfArc(convertTo);
		assertEquals(value, convertBack, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "100.0,1.66667","908.0,15.1333","8091.0,134.85" })
	public void testConvertKnownSecondsOfArcToMinuteOfArc(double input, double expectation) {
		final double result = Angle.SecondsOfArc.toMinuteOfArc(input);
		assertEquals(expectation, result, 0.01);
	}

}
