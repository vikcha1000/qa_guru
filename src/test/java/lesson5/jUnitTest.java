package lesson5;

import org.junit.jupiter.api.*;

public class jUnitTest {

    @BeforeAll
    static void beforeAll(){

        System.out.println("Это сметод beforeAll");
    }

    @AfterAll
    static void afterAll(){

        System.out.println("Это сметод afterAll");
    }



    @BeforeEach
    void beforeEach(){
        System.out.println("Это метод @BeforeEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Это метод @AfterEach");
    }


    @Test
    void firstTest(){
        System.out.println("Это тест");
        Assertions.assertTrue(3>2);

    }

    @Test
    void secondTest(){
<<<<<<< HEAD
        System.out.println("Это secondTest or not");
=======
>>>>>>> a3fcfdb63bdffbc875c3b32d84075180025ad9d4
        Assertions.assertTrue(3>2);

    }
}
