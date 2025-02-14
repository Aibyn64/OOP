package org.libr.library.models;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private int userId;
    private int bookId;
    private Date borrowDate;
    private Date returnDate;

    public Transaction(int transactionId, int userId, int bookId, Date borrowDate, Date returnDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public int getTransactionId() { return transactionId; }
    public int getUserId() { return userId; }
    public int getBookId() { return bookId; }
    public Date getBorrowDate() { return borrowDate; }
    public Date getReturnDate() { return returnDate; }
}
