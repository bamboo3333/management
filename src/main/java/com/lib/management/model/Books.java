package com.lib.management.model;

import java.util.Date;

public class Books {
    private Integer bookId;

    private Integer bookInfoId;

    private Integer bookCreateBy;

    private Integer bookLocationRoom;

    private Integer bookLocationSheet;

    private Integer bookLocationSheetLevel;

    private Date locationUpdateTime;

    private Integer bookBorrowStatus;

    private Date bookPreOrderPassTime;

    private Date bookBorrowUpdateTime;

    private Integer bookBorrowBy;

    private Date bookBorrowedTime;

    private Date bookShouldReturnBefore;

    private Integer bookActiveStatus;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookInfoId() {
        return bookInfoId;
    }

    public void setBookInfoId(Integer bookInfoId) {
        this.bookInfoId = bookInfoId;
    }

    public Integer getBookCreateBy() {
        return bookCreateBy;
    }

    public void setBookCreateBy(Integer bookCreateBy) {
        this.bookCreateBy = bookCreateBy;
    }

    public Integer getBookLocationRoom() {
        return bookLocationRoom;
    }

    public void setBookLocationRoom(Integer bookLocationRoom) {
        this.bookLocationRoom = bookLocationRoom;
    }

    public Integer getBookLocationSheet() {
        return bookLocationSheet;
    }

    public void setBookLocationSheet(Integer bookLocationSheet) {
        this.bookLocationSheet = bookLocationSheet;
    }

    public Integer getBookLocationSheetLevel() {
        return bookLocationSheetLevel;
    }

    public void setBookLocationSheetLevel(Integer bookLocationSheetLevel) {
        this.bookLocationSheetLevel = bookLocationSheetLevel;
    }

    public Date getLocationUpdateTime() {
        return locationUpdateTime;
    }

    public void setLocationUpdateTime(Date locationUpdateTime) {
        this.locationUpdateTime = locationUpdateTime;
    }

    public Integer getBookBorrowStatus() {
        return bookBorrowStatus;
    }

    public void setBookBorrowStatus(Integer bookBorrowStatus) {
        this.bookBorrowStatus = bookBorrowStatus;
    }

    public Date getBookPreOrderPassTime() {
        return bookPreOrderPassTime;
    }

    public void setBookPreOrderPassTime(Date bookPreOrderPassTime) {
        this.bookPreOrderPassTime = bookPreOrderPassTime;
    }

    public Date getBookBorrowUpdateTime() {
        return bookBorrowUpdateTime;
    }

    public void setBookBorrowUpdateTime(Date bookBorrowUpdateTime) {
        this.bookBorrowUpdateTime = bookBorrowUpdateTime;
    }

    public Integer getBookBorrowBy() {
        return bookBorrowBy;
    }

    public void setBookBorrowBy(Integer bookBorrowBy) {
        this.bookBorrowBy = bookBorrowBy;
    }

    public Date getBookBorrowedTime() {
        return bookBorrowedTime;
    }

    public void setBookBorrowedTime(Date bookBorrowedTime) {
        this.bookBorrowedTime = bookBorrowedTime;
    }

    public Date getBookShouldReturnBefore() {
        return bookShouldReturnBefore;
    }

    public void setBookShouldReturnBefore(Date bookShouldReturnBefore) {
        this.bookShouldReturnBefore = bookShouldReturnBefore;
    }

    public Integer getBookActiveStatus() {
        return bookActiveStatus;
    }

    public void setBookActiveStatus(Integer bookActiveStatus) {
        this.bookActiveStatus = bookActiveStatus;
    }
}