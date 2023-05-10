# editube
프로젝트 개인 진행상황

//    Page<Member> paging(Pageable pageble);

//    // 페이징
//    public Page<Member> paging(Pageable pageable){
//        int page = pageable.getPageNumber() - 1;
//        int pageLimit = 3;
//        Page<Member> email = memberRepository.findAll(PageRequest.of(page, pageLimit, Sort.by(Sort.Direction.DESC, "email")));
//    }


//    public Page<Member> paging(Pageable pageable) {
//        int page = pageable.getPageNumber() -1;
//        int pageLimit = 5; // 한 페이지에 보여줄 글 갯수
//        //한 페이지당 3개씩 글을 보여주고 정렬 기준을 email 기준으로 내림차순 정렬
//        // page위치에 있는 값은 0부터 시작
//        Page<Member> boardEntities = memberRepository.findAll(PageRequest.of(page,pageLimit,Sort.by(Sort.Direction.DESC,"email")));
//    }

  
  
  SELECT * FROM(
    SELECT ROWNUM NUM, N.* FROM (
        SELECT * FROM USER_INFO ORDER BY register_date DESC
    ) N
)
WHERE NUM BETWEEN 11 AND 20; 
  
  //    String sql = "SELECT * FROM (SELECT ROWNUM NUM, N.* FROM (SELECT * FROM USER_INFO ORDER BY register_date DESC) N) WHERE NUM BETWEEN ? AND ?";
//    int pageStart = 1; // Start of the page
//    int pageSize = 10; // Number of records to retrieve
//    int pageEnd = pageStart + pageSize - 1; // End of the page
  
  @GetMapping("/users")
public String getUsersPage(@RequestParam(defaultValue = "1") int page, Model model) {
    int pageSize = 10; // Number of records to retrieve per page
    int pageStart = (page - 1) * pageSize + 1; // Start of the page
    int pageEnd = pageStart + pageSize - 1; // End of the page

    List<UserInfo> users = userService.getUsers(pageStart, pageEnd);

    int totalUsers = userService.getTotalUsers(); // Total number of users
    int totalPages = (int) Math.ceil((double) totalUsers / pageSize); // Total number of pages

    model.addAttribute("users", users);
    model.addAttribute("currentPage", page);
    model.addAttribute("totalPages", totalPages);

    return "users";
}

![image](https://user-images.githubusercontent.com/122075060/236695601-a75e0ecf-face-425e-a444-8a0bdcba4ec8.png)
  
  
  
  
 페이징 처리는 xxxxxxxxxxxx
  
  구직 게시판
  포트폴리오 게시판 
  구현.,,.,.,.,.,.
  
  게시글 조회 구현 완료 
  회원 조회 - 조회,검색,삭제,삭제한 데이터 저장

