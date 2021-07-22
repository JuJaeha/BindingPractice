# BindingPractice
Android Studio(Kotlin) / View Binding / Toast

 Toast 메세지 팝업 메세지는 아래와 같이 사용 할 수 있습니다.

        구문 : Toast.makeText(context, text, duration).show()
        context : applicationContext
        text : String 타입의 문자열
        duration : 팝업 메세지 지속 시간
        Toast.LENGTH_SHORT : 2초
        Toast.LENGTH_LONG : 3.5초
        예시 : Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show()


* makeText 끝에 duration parameter에 숫자를 넣어도 무방하나 Toast.LENGTH_SHORT or Toast.LENGTH_LONG을 쓰는게 좋다.
* Toast 사용 시 결과가 안나오면 컴퓨터를 껐다가 키거나 App에 알림이 꺼져있는지 확인해야한다.



<img width="401" alt="스크린샷 2021-07-22 오후 7 03 47" src="https://user-images.githubusercontent.com/85157490/126625256-11806610-c636-4d16-b27f-799701b4188b.png">
