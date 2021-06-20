package ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Zheng
 */

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SkeletonGenerationTest {

    @Test
    void checkYesUPPERCASE() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        Boolean actual = myApp.checkYes("YES");
        assertEquals(true, actual);
    }

    @Test
    void checkYesLowercase() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        Boolean actual = myApp.checkYes("yes");
        assertEquals(true, actual);
    }

    @Test
    void checkYesMIXEDCase() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        Boolean actual = myApp.checkYes("Yes");
        assertEquals(true, actual);
    }

    @Test
    void checkY() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        Boolean actual = myApp.checkYes("Y");
        assertEquals(true, actual);
    }

    @Test
    void checky() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        Boolean actual = myApp.checkYes("y");
        assertEquals(true, actual);
    }

    @Test
    void directoryPathJS() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        String mainpath = "src/main/java/ex43/website/awesomeco";
        String actual = myApp.directoryPathJS(mainpath);
        assertEquals("src/main/java/ex43/website/awesomeco/js", actual);
    }

    @Test
    void directoryPathCSS() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        String mainpath = "src/main/java/ex43/website/awesomeco";
        String actual = myApp.directoryPathCSS(mainpath);
        assertEquals("src/main/java/ex43/website/awesomeco/css", actual);
    }

    @Test
    void createMainDirectory() throws IOException {
        SkeletonGeneration myApp = new SkeletonGeneration();
        String siteName = "awesomeco";
        String actual = myApp.createMainDirectory(siteName);
        assertEquals("src/main/java/ex43/website/awesomeco", actual);
    }

    @Test
    void createMainDirectory2() throws IOException {
        SkeletonGeneration myApp = new SkeletonGeneration();
        String siteName = "awesomeco2";
        String actual = myApp.createMainDirectory(siteName);
        assertEquals("src/main/java/ex43/website/awesomeco2", actual);
    }

    @Test
    void createMainDirectory3() throws IOException {
        SkeletonGeneration myApp = new SkeletonGeneration();
        String siteName = "adfsfsf8sffwinwigwjg92";
        String actual = myApp.createMainDirectory(siteName);
        assertEquals("src/main/java/ex43/website/adfsfsf8sffwinwigwjg92", actual);
    }

    @Test
    void createHTMLFile() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        String mainpath = "src/main/java/ex43/website/awesomeco";
        String actual = myApp.createHTMLFile(mainpath);
        assertEquals("src/main/java/ex43/website/awesomeco/index.html", actual);
    }

    @Test
    void createHTMLFile2() {
        SkeletonGeneration myApp = new SkeletonGeneration();
        String mainpath = "src/main/java/ex43/website/beargrillz";
        String actual = myApp.createHTMLFile(mainpath);
        assertEquals("src/main/java/ex43/website/beargrillz/index.html", actual);
    }
}