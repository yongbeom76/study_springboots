package com.study.study_springboots.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.study.study_springboots.beans.BoardBean;

@Service
public class DataInfors {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "김용범");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListDataWithString = new ArrayList<String>();
        tablesListDataWithString.add("@mdo");
        tablesListDataWithString.add("@fat");
        tablesListDataWithString.add("@twitter");

        return tablesListDataWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors DataInfors = new DataInfors();
        HashMap<String, String> searchForm = DataInfors.getSearchFormData();
        ArrayList<String> tablesListDataWithString = DataInfors.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListDataWithString", tablesListDataWithString);

        bundlesData.put("dataWithBoardBean", DataInfors.getDataWithBoardBean());
        bundlesData.put("dataListWithBoardBean", DataInfors.getDataListWithBoardBean());

        return bundlesData;
    }

    public BoardBean getDataWithBoardBean() {
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }

    public BoardBean getBean(String title) {
        List<BoardBean> boardList = getBoard();
        BoardBean boardBean = new BoardBean();
        for (BoardBean bean : boardList) {
            if (bean.getTitle().equals(title)) {
                return bean;
            }
        }
        boardBean.setTitle("에러: 없습니다.");
        return boardBean;
    }

    public ArrayList<BoardBean> getDataListWithBoardBean() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Jacob");
        boardBean.setContent("Thornton");
        boardBean.setUserName("@fat");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Larry");
        boardBean.setContent("Bird");
        boardBean.setUserName("@twitter");
        membersList.add(boardBean);

        return membersList;
    }

    public List<BoardBean> getBoard() {
        List<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Spring의 기초");
        boardBean.setUserName("김용범");
        boardBean.setDate("2022/01/05");
        boardBean.setContent(
                "이번 포스팅에서는 인턴을 하게 된 회사에서 진행해준 신입사원 교육 중, Spring의 기초에 대해 정리해보려 합니다. Spring Boot로 프로젝트를 경험이 있어서 Spring의 특징에 대해 어느 정도 알고 있다고 생각하고 있었는데, 이 교육을 듣고 Spring에 대해 한층 더 자세히 알게 되었습니다.......");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Mybatis란?");
        boardBean.setUserName("김병근");
        boardBean.setDate("2022/01/03");
        boardBean.setContent(
                "객체 지향 언어인 자바의 관계형 데이터베이스 프로그래밍을 좀 더 쉽게 할 수 있게 도와 주는 개발 프레임 워크로서 JDBC를 통해 데이터베이스에 엑세스하는 작업을 캡슐화하고 일반 SQL 쿼리, 저장 프로 시저 및 고급 매핑을 지원하며 모든 JDBC 코드 및 매개 변수의 중복작업을 제거 합니다. Mybatis에서는 프로그램에 있는 SQL쿼리들을 한 구성파일에 구성하여 프로그램 코드와 SQL을 분리할 수 있는 장점을 가지고 있습니다.");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("JPA활용법");
        boardBean.setUserName("길진수");
        boardBean.setDate("2022/01/01");
        boardBean.setContent(
                "JPA에 대한 개념은 이해가 갔지만 처음 코드를 접했을 땐 이해 안가는 부분이 많았다. 그래서 잘 정리된 블로그를 참고해 다시 한번 사용법을 알기 쉽게 정리해보고자 한다.");
        membersList.add(boardBean);

        return membersList;
    }

    public List<BoardBean> insertBean(BoardBean bean) {
        List<BoardBean> board = getBoard();
        board.add(bean);
        return board;
    }
}
