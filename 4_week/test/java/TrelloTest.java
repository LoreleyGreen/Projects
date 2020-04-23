import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrelloTest {

    private String boardId;
    private String cardId;
    private String listId;


    @Test(priority = 1)
    public void checkCreateBoard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();

        Board board = new Board();
        String name = "New board";

        Board createBoard = retrofitBuilder.getTrelloApi().createBoard(board, name).execute().body();

        boardId = createBoard.getId();

        Assert.assertEquals(createBoard.getName(), name);
    }


    @Test(priority = 2)
    public void checkCreateList() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();

        Board board = new Board();
        String name = "New List";

        Board createList = retrofitBuilder.getTrelloApi().createList(name, boardId, board.getKey(), board.getToken()).execute().body();

        listId = createList.getId();

        Assert.assertEquals(createList.getName(), name);
    }
//
    @Test(priority = 3)
    public void checkCreateCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();

        Board board = new Board();
        String name = "New card";

        Board createCard = retrofitBuilder.getTrelloApi().createCard(board, name, listId).execute().body();

        cardId = createCard.getId();
        System.out.println(cardId);
        Assert.assertEquals(createCard.getName(), name);
    }

        @Test(priority = 4)
    public void checkGetCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Board board = new Board();

        Board getCard = retrofitBuilder.getTrelloApi().getCard(cardId, board.getKey(), board.getToken()).execute().body();

        Assert.assertEquals(getCard.getIdCard(), cardId);

    }
    @Test(priority = 5)
    public void checkUpdateCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Board card = new Board();
        String updatedName = "Update card name";
        card.setName(updatedName);

        Board updatedCard = retrofitBuilder.getTrelloApi().updateCard(cardId, card).execute().body();
        System.out.println(cardId);
        Assert.assertEquals(updatedCard.getName(), updatedName);
    }

    @Test(priority = 6)
    public void checkDeleteCard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Board board = new Board();

        int code = retrofitBuilder.getTrelloApi().deleteCard(cardId, board.getKey(), board.getToken()).execute().code();


        Assert.assertEquals(code, 200);

    }
        @Test(priority = 7)
    public void checkDeleteBoard() throws IOException {
        RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
        Board board = new Board();

        int code = retrofitBuilder.getTrelloApi().deleteBoard(boardId, board.getKey(), board.getToken()).execute().code();


        Assert.assertEquals(code, 200);

    }
}