-- MySQL에서도 변수를 쓸 수 있는데
-- 세션(Session) 변수(Variable)는 서버에 접속해서 접속을 끊을 때까지는 유지되는 변수이다
SET @myVar := 10; -- set으로 지정해주고 세션 변수의 이름에는 @가 들어가고 := 이 대입연산자
SELECT @myVar * 10 + 5;