void test(int tg){
if ( S_ERR ( blkg       )       )     tg = blkg_to_tg ( blkg       )          ;    else if ( lk_queue_dying ( q       )       )     tg = td_root_tg ( td       )          ;    }  }