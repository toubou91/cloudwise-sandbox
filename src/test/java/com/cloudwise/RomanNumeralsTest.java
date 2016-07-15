package com.cloudwise;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

	private RomanNumerals romanNumerals = new RomanNumerals();

	@Test
	public void shouldReturn1() throws Exception {
		assertThat(romanNumerals.convert(1), is("i"));
	}

	@Test
	public void shouldReturn2() throws Exception {
		assertThat(romanNumerals.convert(2), is("ii"));
	}

	@Test
	public void shouldReturn3() throws Exception {
		assertThat(romanNumerals.convert(3), is("iii"));
	}

	@Test
	public void shouldReturn4() throws Exception {
		assertThat(romanNumerals.convert(4), is("iv"));
	}

	@Test
	public void shouldReturn5() throws Exception {
		assertThat(romanNumerals.convert(5), is("v"));
	}

	@Test
	public void shouldReturn6() throws Exception {
		assertThat(romanNumerals.convert(6), is("vi"));
	}

	@Test
	public void shouldReturn7() throws Exception {
		assertThat(romanNumerals.convert(7), is("vii"));
	}

	@Test
	public void shouldReturn8() throws Exception {
		assertThat(romanNumerals.convert(8), is("viii"));
	}

	@Test
	public void shouldReturn9() throws Exception {
		assertThat(romanNumerals.convert(9), is("ix"));
	}

	@Test
	public void shouldReturn10() throws Exception {
		assertThat(romanNumerals.convert(10), is("x"));
	}

	@Test
	public void shouldReturn11Till39() throws Exception {
		assertThat(romanNumerals.convert(11), is("xi"));
		assertThat(romanNumerals.convert(12), is("xii"));
		assertThat(romanNumerals.convert(13), is("xiii"));
		assertThat(romanNumerals.convert(14), is("xiv"));
		assertThat(romanNumerals.convert(15), is("xv"));
		assertThat(romanNumerals.convert(16), is("xvi"));
		assertThat(romanNumerals.convert(17), is("xvii"));
		assertThat(romanNumerals.convert(18), is("xviii"));
		assertThat(romanNumerals.convert(19), is("xix"));
		assertThat(romanNumerals.convert(20), is("xx"));
		assertThat(romanNumerals.convert(21), is("xxi"));
		assertThat(romanNumerals.convert(22), is("xxii"));
		assertThat(romanNumerals.convert(23), is("xxiii"));
		assertThat(romanNumerals.convert(24), is("xxiv"));
		assertThat(romanNumerals.convert(25), is("xxv"));
		assertThat(romanNumerals.convert(26), is("xxvi"));
		assertThat(romanNumerals.convert(27), is("xxvii"));
		assertThat(romanNumerals.convert(28), is("xxviii"));
		assertThat(romanNumerals.convert(29), is("xxix"));
		assertThat(romanNumerals.convert(30), is("xxx"));
		assertThat(romanNumerals.convert(31), is("xxxi"));
		assertThat(romanNumerals.convert(32), is("xxxii"));
		assertThat(romanNumerals.convert(33), is("xxxiii"));
		assertThat(romanNumerals.convert(34), is("xxxiv"));
		assertThat(romanNumerals.convert(35), is("xxxv"));
		assertThat(romanNumerals.convert(36), is("xxxvi"));
		assertThat(romanNumerals.convert(37), is("xxxvii"));
		assertThat(romanNumerals.convert(38), is("xxxviii"));
		assertThat(romanNumerals.convert(39), is("xxxix"));
	}
}
