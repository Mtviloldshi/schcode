package com.schcode.service;

import com.schcode.mapper.BookMapper;
import com.schcode.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookMapper bookMapper;

    @Override
    public void saveBook(Book book) {
        bookMapper.insertSelective(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Book> queryBooks() {
        return bookMapper.selectByExample(null);
    }


}
