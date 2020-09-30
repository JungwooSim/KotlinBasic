package chap06.section3;

public class PackageLevelAccess {
    public static void main(String[] args) {
//        PackageLevelFunctionKt.packageLevelFunc(); // Kt 가 접미사로 붙은것 확인 가능
        PKLevel.packageLevelFunc(); // @file:JvmName 어노테이션 사용했을때
    }
}
