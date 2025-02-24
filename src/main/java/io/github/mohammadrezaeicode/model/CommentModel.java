package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.annotation.Options;
import io.github.mohammadrezaeicode.excel.model.Comment;
import io.github.mohammadrezaeicode.excel.model.DataOption;
import io.github.mohammadrezaeicode.excel.model.MultiStyleValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CommentModel extends DataOption {
    @Options(title = "Name", order = 3)
    private String c3;
    @Options(title = "**", order = 1)
    private Number c1;
    @Options(title = "++", order = 2)
    private Number c2;
    @Options(title = "gender", order = 4)
    private Number c5;

    public static Builder cBuilder() {
        return new Builder();
    }

    public static class Builder {
        private CommentModel commentModel;

        public Builder() {
            this.commentModel = new CommentModel();
        }

        public Builder c3(String c3) {
            commentModel.c3 = c3;
            return this;
        }

        public Builder c1(Number c1) {
            commentModel.c1 = c1;
            return this;
        }

        public Builder c2(Number c2) {
            commentModel.c2 = c2;
            return this;
        }

        public Builder c5(Number c5) {
            commentModel.c5 = c5;
            return this;
        }

        public Builder comment(Map<Method, Comment> commentMap) {
            commentModel.setComment(commentMap);
            return this;
        }
        public Builder addComment(Method key, String comment) {
            commentModel.addComment(key, new Comment(comment));
            return this;
        }
        public Builder addComment(Method key, Comment comment) {
            commentModel.addComment(key, comment);
            return this;
        }
        public Builder addMultiStyle(Method method,List<MultiStyleValue> multiStyleValues){
            commentModel.addMultiStyle(method,multiStyleValues);
            return this;
        }

        public CommentModel build() {
            return commentModel;
        }

    }
}
