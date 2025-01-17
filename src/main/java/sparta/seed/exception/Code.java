package sparta.seed.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Code {

    INDEX_NOT_FOUND("1001", "인덱스가 존재하지 않습니다."),
    BOARD_NOT_FOUND("1002", "게시글을 찾을 수 없습니다."),
    UNKNOWN_ERROR("400", "토큰이 존재하지 않습니다."),
    WRONG_TYPE_TOKEN("400", "변조된 토큰입니다."),
    EXPIRED_TOKEN("400", "만료된 토큰입니다."),
    UNSUPPORTED_TOKEN("400", "변조된 토큰입니다."),
    ACCESS_DENIED("400", "권한이 없습니다.");



    private String code;
    private String message;


}