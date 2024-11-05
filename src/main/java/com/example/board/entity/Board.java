package com.example.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Board extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;
    private String title;
    private String content;
    //작성자 아직 미처리 추후 member
    @ManyToOne(fetch = FetchType.LAZY)//lazy로딩 지정
    private Member writer;// pk가지고 엔티티자체를 가져오는거고 저장시에는 findbyid 엔티티를 가져와서 저장
    public  void changeTitle(String title){
        this.title=title;
    }
    public void changeContent(String content){
        this.content=content;
    }

}
