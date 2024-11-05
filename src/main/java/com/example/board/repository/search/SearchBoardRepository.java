package com.example.board.repository.search;

import com.example.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchBoardRepository {
    Board search1();//board 타입 객체 반환
    Page<Object[]> searchPage(String type, String keyword, Pageable pageable);
}
