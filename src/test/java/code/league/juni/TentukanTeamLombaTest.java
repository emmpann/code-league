package code.league.juni;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TentukanTeamLombaTest {

	@Test
	void kombinasiTest() {
		Assertions.assertEquals(10, TentukanTeamLomba.kombinasi(5, 2));
		Assertions.assertEquals(84, TentukanTeamLomba.kombinasi(9, 3));
		Assertions.assertEquals(1, TentukanTeamLomba.kombinasi(3, 3));
	}

	@Test
	void testCase1() {
		Assertions.assertEquals("Matematika: 4158 team\n" +
				"Kimia: 1260 team", TentukanTeamLomba.tentukanTeamLomba(3, 7, 12));
	}

	@Test
	void testCase2() {
		Assertions.assertEquals("Matematika: 6048 team\n" +
				"Kimia: 10080 team", TentukanTeamLomba.tentukanTeamLomba(6, 9, 8));
	}

	@Test
	void testCase3() {
		Assertions.assertEquals("Matematika: 2310 team\n" +
				"Kimia: 13860 team", TentukanTeamLomba.tentukanTeamLomba(7, 11, 4));
	}

	@Test
	void testCase4() {
		Assertions.assertEquals("Matematika: 1296 team\n" +
				"Kimia: 16632 team", TentukanTeamLomba.tentukanTeamLomba(12, 9, 3));
	}

	@Test
	void testCase5() {
		Assertions.assertEquals("Matematika: 5040 team\n" +
				"Kimia: 22176 team", TentukanTeamLomba.tentukanTeamLomba(12, 8, 6));
	}
}
