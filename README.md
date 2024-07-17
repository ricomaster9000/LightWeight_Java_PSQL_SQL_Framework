# LightWeight_Java_PSQL_Framework
Lightweight Java PSQL Database interaction framework built to be used effectively on lambdas running on Java but can be used for traditional apps as well

For Java 11+

Dependency size is small (what lambdas need when cold booting), I tried to keep it as small as possible, but further improvements could perhaps still be made

It uses Apache's DB Utils as its core, with more code wrapped around that but it still allows you to go full base and just execute raw queries via Apache DB utils core

This is for people who want something more simpler than Hibernate or JPA/JTA frameworks with a very small library size footprint and less abstracted deeper layers like entity context layer etc.
This is not a full replacement for those frameworks, but a "light" replacement, it could become a good "light" replacement in the future...

### do not pass in more than 30000 rows/entities at a time as params when calling methods (unless its for delete or a get), you can call it with multiple 30000 entities for each method call at the same time but not more than 30000, I am not sure if the ApachaUtils core framework code has setup logic to handle this, do at your own risk or split up the calls, I will test this soon and fix it if I have to, the problem is that the 34000+- rows migth be a limit for the IN operator in PSQL Queries

#### set the following properties inside you properties file or as environment variables: 
- datasource.url or DATABASE_URL(must contain full connection path plus db name)
  - example format: jdbc:postgresql://host:port/database
- datasource.username or DATABASE_USERNAME
- datasource.password or DATABASE_PASSWORD

#### optionally set the following properties inside your properties file or as environment variables:
- datasource.max_db_connection_pool_size or DB_CONNECTION_POOL_SIZE (defaults to 40)

### example code (with tests in MainTest Class):(https://github.com/ricomaster9000/LightWeight_Java_PSQL_Framework/tree/main/testing/src/test/java/org.greatgamesonly.shared.opensource.sql.framework)

Also, every public method in the BaseRepository class is usable for every defined Repository class, these come available from the start, there are many methods (in  https://github.com/ricomaster9000/LightWeight_Java_PSQL_Framework/blob/main/src/main/java/org/greatgamesonly/shared/opensource/sql/framework/lightweightsql/database/BaseRepository.java)


add as dependency by using jitpack.io, go to this link: https://jitpack.io/#ricomaster9000/LightWeight_Java_PSQL_Framework/1.5.2

Will upload to Maven later, once I am fully done and have more time
