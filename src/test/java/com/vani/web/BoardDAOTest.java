package com.vani.web;

import com.vani.web.doa.BoardDAO;
import com.vani.web.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {

    private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

    @Inject
    private BoardDAO dao;

    @Test
    public void testCreate() throws Exception{
        BoardVO board = new BoardVO();
        board.setTitle("새로운 글");
        board.setContent("새로운 글을 작성합니다.");
        board.setWriter("user00");
        dao.create(board);
    }

    @Test
    public void testRead() throws Exception{
//        logger.info(dao.read(1).toString());
        System.out.println(dao.read(2).toString());
    }

    @Test
    public void testUpdate() throws Exception{
        BoardVO board = new BoardVO();
        board.setBno(2);
        board.setTitle("수정글");
        board.setContent("수정된 글입니다.");
        dao.update(board);
    }

    @Test
    public void testDelete() throws Exception{
        dao.delete(2);
    }
}
