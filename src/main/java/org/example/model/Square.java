package org.example.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DefaultSquare.class, name = "default square"),
        @JsonSubTypes.Type(value = LadderSquare.class, name = "ladder square"),
        @JsonSubTypes.Type(value = SnakeSquare.class, name = "snake square"),
})
public interface Square {
    void execute(BoardGame boardGame);
    boolean isLastSquare();

}
