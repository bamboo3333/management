package com.lib.management.service.serviceImpl;

import com.lib.management.mapper.BooksMapper;
import com.lib.management.model.Books;
import com.lib.management.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BooksMapper booksMapper;

    @Override
    public boolean addNewBookCopy(Books books, int number) {
        Date currentDate = new Date();
        books.setLocationUpdateTime(currentDate);
        books.setBookBorrowStatus(0);
        books.setBookBorrowStatus(0);
        books.setBookBorrowUpdateTime(currentDate);
        books.setBookActiveStatus(1);
        boolean flag = false;
        try{
            booksMapper.insert(books);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateBookInfo(Books books) {
        return false;
    }
}
