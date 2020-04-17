package com.larscheng.www.service;


import com.larscheng.www.dao.BooksDao;
import com.larscheng.www.pojo.Books;

import java.util.List;

/**
 * @author: larscheng
 * @date: 2020/4/17 下午12:01
 * @description:
 */
//@Service
public class BooksService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BooksDao booksDao;

    public void setBooksDao(BooksDao booksDao) {
        this.booksDao = booksDao;
    }

    public int addBook(Books book) {
        return booksDao.addBook(book);
    }

    public int deleteBookById(int id) {
        return booksDao.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return booksDao.updateBook(books);
    }

    public Books queryBookById(int id) {
        return booksDao.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return booksDao.queryAllBook();
    }
}
