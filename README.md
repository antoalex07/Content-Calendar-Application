# learn-spring-boot

This project is me trying to learn spring boot using the youtube video Spring Boot Tutorial for Beginners - 
2023 Crash Course using Spring Boot 3 by Dan Vega. Its been a few days since I started to do this and has 
had an easy experience moving on with the wee application. Last day I started to work on the databases and 
got stuck with an error. The program hasn't been running ever since. The error is related to SQL grammar 
exception and from the terminal it was hard to understand where exactly was the error. The error said that 
it was not DATE_CREATED and it wasn't I put it as dateCreated and there was many place in which it was used 
i traced every last one of them and made them all the same but still was facing the same problem. Then I changed
all of them to date_created. And guess what it worked. I am yet to figure out how that happened. The few evidence 
I have is that

Caused by: org.h2.jdbc.JdbcSQLSyntaxErrorException: Column "DATE_CREATED" not found; SQL statement:
INSERT INTO "CONTENT" ("DATE_CREATED", "DATE_UPDATED", "DESC", "STATUS", "TITLE", "TYPE", "URL") VALUES (?, ?, ?, ?, ?, ?, ?) [42122-214]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:502) ~[h2-2.1.214.jar:2.1.214]    
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:477) ~[h2-2.1.214.jar:2.1.214]    
        at org.h2.message.DbException.get(DbException.java:223) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.message.DbException.get(DbException.java:199) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.table.Table.getColumn(Table.java:749) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.command.Parser.parseColumn(Parser.java:1256) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.command.Parser.parseColumnList(Parser.java:1241) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.command.Parser.parseInsert(Parser.java:1641) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.command.Parser.parsePrepared(Parser.java:814) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.command.Parser.parse(Parser.java:689) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.command.Parser.parse(Parser.java:661) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.command.Parser.prepareCommand(Parser.java:569) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.engine.SessionLocal.prepareLocal(SessionLocal.java:631) ~[h2-2.1.214.jar:2.1.214]
        at org.h2.engine.SessionLocal.prepareCommand(SessionLocal.java:554) ~[h2-2.1.214.jar:2.1.214]        
        at org.h2.jdbc.JdbcConnection.prepareCommand(JdbcConnection.java:1116) ~[h2-2.1.214.jar:2.1.214]     
        at org.h2.jdbc.JdbcPreparedStatement.<init>(JdbcPreparedStatement.java:92) ~[h2-2.1.214.jar:2.1.214] 
        at org.h2.jdbc.JdbcConnection.prepareStatement(JdbcConnection.java:1044) ~[h2-2.1.214.jar:2.1.214]   
        at com.zaxxer.hikari.pool.ProxyConnection.prepareStatement(ProxyConnection.java:334) ~[HikariCP-5.0.1.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyConnection.prepareStatement(HikariProxyConnection.java) ~[HikariCP-5.0.1.jar:na]
        at org.springframework.jdbc.core.PreparedStatementCreatorFactory$PreparedStatementCreatorImpl.createPreparedStatement(PreparedStatementCreatorFactory.java:232) ~[spring-jdbc-6.0.10.jar:6.0.10]
        at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:649) ~[spring-jdbc-6.0.10.jar        ... 47 common frames omitted

        In the sql command given here which I did not make and all the coloumn  names are messed up. I tried to find it but was 
        unsuccessfull at that. If anyone ever make it to here please share your thoughts or answer if u know.
