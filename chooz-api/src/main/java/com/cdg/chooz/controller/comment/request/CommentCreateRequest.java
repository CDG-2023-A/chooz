package com.cdg.chooz.controller.comment.request;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentCreateRequest {

    private Long parentId;

    private String content;

}
