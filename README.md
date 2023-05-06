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
