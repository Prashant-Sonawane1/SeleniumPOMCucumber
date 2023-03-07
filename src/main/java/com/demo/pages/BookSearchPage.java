package com.demo.pages;

import com.demo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;


public class BookSearchPage extends TestBase {

    //Object Repo
   static By searchBar = By.xpath("//*[@id=\"searchBar\"]");
   static By bookTitle = By.xpath("//*[@id=\"pid7_title\"]");

    //Methods

    public static void searchBook(String bookname){

        driver.findElement(searchBar).sendKeys(bookname);

    }

    public static void verifyBookName(String bookname){

        Assert.assertEquals(bookname,driver.findElement(bookTitle).getText());

    }


}
