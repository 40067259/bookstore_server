package com.example.A3.UsedBookLibrary.mapper;

import com.example.A3.UsedBookLibrary.domain.AD;
import com.example.A3.UsedBookLibrary.domain.Book;
import org.apache.ibatis.annotations.*;

import java.sql.Blob;
import java.util.List;

@Mapper
public interface UsedBookMapper {

    @Insert("insert into book(ISBN,title,author,description,year,cover)"+
    "values(#{ISBN},#{title},#{author},#{description},#{year},#{cover})")
    public int createBook(String ISBN, String title, String author,
                          String description, String year, Blob cover);

    @Update("update book Set title=#{title},author=#{author},description=#{description}," +
            "year=#{year},cover=#{cover} where ISBN=#{ISBN}")
    public int updateBook(String ISBN, String title, String author,
                          String description, String year, Blob cover);

    @Delete("delete from book where ISBN=#{ISBN}")
    public int deleteBookByISBN(String ISBN);

    @Select("select cover from book WHERE ISBN = #{ISBN}")
    public byte [] getBookCover(String ISBN);

    @Update("UPDATE book SET cover = #{cover} WHERE ISBN = #{ISBN}")
    public int updateBookCover(String ISBN, Blob cover);

    @Delete("delete cover from book where ISBN = #{ISBN}")
    public int deleteBookCover(String ISBN);

    @Insert("insert into AD(ID,title,comment,ISBN,description,price,quantity,cover)"+
            "values(#{ID},#{title},#{comment},#{ISBN},#{description},#{price},#{quantity},#{cover})")
    public int createAD(String ID, String title, String description, double price,
                        String ISBN, String comment, int quantity, Blob cover);

    @Update("update AD Set title=#{title},price=#{price},description=#{description}," +
            "ISBN=#{ISBN},comment=#{comment}, quantity=#{quantity}, cover=#{cover} where ID=#{ID}")
    public int updateAD(String ID, String title, String description, double price,
                        String ISBN, String comment, int quantity, Blob cover);

    @Delete("delete from AD where ID=#{ID}")
    public int deleteAD(String ID);

    @Select("select * from book where ISBN=#{ISBN}")
    public Book getBookByISBN(String ISBN);

    @Select("select * from AD where ID=#{ID}")
    public AD getADByID(String ID);

    @Select("select * from book")
    public List<Book> getAllBook();

    @Select("select * from AD")
    public List<AD> getALLAD();

    @Insert("insert into bookRepo(ISBN,quantity) " +
            "values(#{ISBN},#{quantity})")
    public int insertToBookRepo(String ISBN, int quantity);

    @Select("select quantity from bookRepo where ISBN=#{ISBN}")
    public int getBookQuantityByISBN(String ISBN);

    @Update("update bookRepo set quantity=#{quantity} where ISBN=#{ISBN}")
    public int updateBookQuantity(String ISBN,int quantity);

    @Select("select comment from AD where ID=#{ID}")
    public String getCommentByID(String ID);

    @Update("update AD set comment=#{comment} where ID=#{ID}")
    public void updateComment(String ID, String comment);

    @Select("select ban from AD where ID=#{ID}")
    public boolean getADState(String ID);

    @Update("update AD set ban=#{ban} where ID=#{ID}")
    public void updateADState(String ID, boolean ban);
}
