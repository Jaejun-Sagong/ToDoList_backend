package sparta.seed.todo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Getter;

@Getter
public class TodoResponseDto {
    private long todoId;
    private String content;
    private boolean isComplete;
    private String addDate;

    @Builder
    @QueryProjection
    public TodoResponseDto(long todoId, String content, boolean isComplete, String addDate) {
        this.todoId = todoId;
        this.content = content;
        this.isComplete = isComplete;
        this.addDate = addDate;
    }
}

