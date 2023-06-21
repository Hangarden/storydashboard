//joinform_check 함수로 유효성 검사
function joinForm_check() {
    //변수에 담아주기
    var firstname = document.getElementById("firstname");
    var lastname = document.getElementById("secondname");
    var email = document.getElementById("email");
    var password = document.getElementById("password");
    var repeatpassword = document.getElementById("repeatPassword");

    //비밀번호 영문자+숫자+특수조합(8~25자리 입력) 정규식
    const nameReg = /^[a-zA-Z]+$/;
    const pwdCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,20}$/;
    const emailReg = /'^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$'/;


    if (!nameReg.test(firstname.value)) {
        alert("영문이름으로 적어주세요.");
        firstname.focus();
        return false;
    };

    if (!nameReg.test(lastname.value)) {
        alert("영문이름으로 적어주세요.");
        lastname.focus();
        return false;
    };

    if (firstname.value == "") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
        alert("이름을 입력하세요");
        firstname.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
        return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
    };

    if (lastname.value == "") {
        alert("성을 입력하세요.");
        lastname.focus();
        return false;
    };




    if (!pwdCheck.test(password.value)) {
        alert("비밀번호는 영문자+숫자+특수문자 조합으로 8~25자리 사용해야 합니다.");
        password.focus();
        return false;
    };

    if (!pwdCheck.test(repeatpassword.value)) {
        alert("비밀번호는 영문자+숫자+특수문자 조합으로 8~25자리 사용해야 합니다.");
        repeatpassword.focus();
        return false;
    };

    if (repeatpassword.value !== password.value) {
        alert("비밀번호가 일치하지 않습니다..");
        password.focus();
        return false;
    };

    if (!emailReg.test(email.value)) {
        alert("이메일 양식을 맞춰주세요.");
        email.focus();
        return false;
    };

    if (email.value == "") {
        alert("이메일을 입력하세요.");
        email.focus();
        return false;
    };

    // if (!female.checked && !male.checked) { //둘다 미체크시
    //     alert("성별을 선택해 주세요.");
    //     female.focus();
    //     return false;
    // }

    // var reg = /^[0-9]+/g; //숫자만 입력하는 정규식
    //
    // if (!reg.test(mobile.value)) {
    //     alert("전화번호는 숫자만 입력할 수 있습니다.");
    //     mobile.focus();
    //     return false;
    // }
    //
    // if (email_id.value == "") {
    //     alert("이메일 주소를 입력하세요.");
    //     email_id.focus();
    //     return false;
    // }
    //
    // if (!agree.checked) { //체크박스 미체크시
    //     alert("약관 동의를 체크하세요.");
    //     agree.focus();
    //     return false;
    // }

    //입력 값 전송
    document.join_form.submit();
    //유효성 검사의 포인트

}

//아이디 중복체크 팝업창(현재 공백문서)
function id_check() {
    //window.open("팝업될 문서 경로", "팝업될 문서 이름", "옵션");
    window.open("", "", "width=600, height=200, left=200, top=100");
}

//이메일 옵션 선택후 주소 자동 완성
// function change_email() {
//     var email_add = document.getElementById("email_add");
//     var email_sel = document.getElementById("email_sel");
//
//     //지금 골라진 옵션의 순서와 값 구하기
//     var idx = email_sel.options.selectedIndex;
//     var val = email_sel.options[idx].value;
//
//     email_add.value = val;
// }
//
// //우편번호 검색 팝업창(현재 공백문서)
// function search_address() {
//     window.open("", "b", "width=600, height=300, left=200, top=100");
// }