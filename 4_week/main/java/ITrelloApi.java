import retrofit2.Call;
import retrofit2.http.*;

public interface ITrelloApi {

    @POST("/1/boards/")
    Call<Board> createBoard(@Body Board board, @Query("name") String name);

    @POST("/1/lists")
    Call<Board> createList(@Query("name") String name,
                          @Query("idBoard")  String boardId,
                          @Query("key") String key,
                          @Query("token") String token);


    @POST("/1/cards")
    Call<Board> createCard(@Body Board board, @Query("name") String name,
                           @Query("idList") String idList);

    @GET("/1/cards/{id}")
    Call<Board> getCard(@Path("id") String id,
                        @Query("key") String key,
                        @Query("token") String token);

    @PUT("/1/cards/{id}")
    Call<Board> updateCard(@Path("id") String id, @Body Board card);

    @DELETE("/1/cards/{id}")
    Call<Board> deleteCard(@Path("id") String id,
                           @Query("key") String key,
                           @Query("token") String token);

    @DELETE("/1/boards/{id}")
    Call<Board> deleteBoard(@Path("id") String id,
                            @Query("key") String key,
                            @Query("token") String token);

}

