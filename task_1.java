@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    boolean expected = true;
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Пользователю меньше 18 лет", expected, isAdult);// Напиши код здесь
}