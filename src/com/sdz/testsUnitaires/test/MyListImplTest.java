package com.sdz.testsUnitaires.test;

import com.sdz.testsUnitaires.main.MyList;
import com.sdz.testsUnitaires.main.MyListImpl;
import org.junit.*;
import org.junit.runner.RunWith;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;


public class MyListImplTest {

    private static MyList<Integer> sut;  //la classe à tester
    private static int expectedSize;  // la taille à l'origine
    private static Properties prop;  // les propriétés
    private static List<Integer> testSet;  //les nombres que nous mettrons dans notre class
    private static FileInputStream propFile;  //le fichier de propriétés

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("avant tout");
        prop = new Properties();
        testSet = new LinkedList<Integer>();
        propFile = new FileInputStream("src/config.properties"); //charge le fichier de propriétés
        prop.load(propFile);
        expectedSize = Integer.parseInt(prop.getProperty("taille")); //parse la taille
        String numbers = prop.getProperty("nombre"); //récupère les nombre à mettre dans la liste
        for(String i : numbers.split(" ")) { //pour chaque nombre
            testSet.add(Integer.parseInt(i.trim()));  // l'enregistrer en tant que int
        }
        sut = new MyListImpl<Integer>();  // instancier la classe à tester
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("apres tout");
        propFile.close();   // on ferme le fichier à la fin du test
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("avant un test");
        for (int i : testSet) {
            sut.add(new Integer(i));   //on ajoute les nombres au début de chaque test
        }
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("apres un test");
        sut.reset();  // à la fin de chaque test, on reset notre liste
    }
    @Test
    public void testAdd() {
        assertEquals(expectedSize, sut.getSize());
        sut.add(new Integer(8));
        assertEquals(expectedSize+1, sut.getSize());
        for(int i = 0; i < testSet.size(); i++) {
            assertEquals(testSet.get(i), sut.getAt(i));
        }
    }


        /*
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("avant tout");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("apres tout");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("avant un test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("apres un test");
    }

    @Test
    public void add() {
        fail("Not Yet implemented");
    }

    @Test
    public void removeAt() {
        fail("Not Yet implemented");
    }

    @Test
    public void removeItem() {
        fail("Not Yet implemented");
    }

    @Test
    public void setAt() {
        fail("Not Yet implemented");
    }
    */
}
