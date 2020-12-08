package com.schcode.ssm.test;

import com.schcode.pojo.Book;
import com.schcode.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BookServiceTest {
    @Autowired
    BookService bookService;

    @Test
    public void saveBook(){
        bookService.saveBook(new Book(null,"神仙书","SZ 王灿桥",new BigDecimal(1000),1000,100000));
    }
    @Test
    public void updateBook() {
        bookService.updateBook(new Book(21,"把国哥,拉出去糟蹋了",
                "SZ王灿侨", new BigDecimal(1000), 10000,10000));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(21);
    }

    @Test
    public void queryBookById() {
        Book book = bookService.queryBookById(1);
        System.out.println(book);
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookService.queryBooks()) {
            System.out.println(queryBook);
        }
    }



}
