int test(int jiffy_wait, int jiffy_elapsed){
if ( jiffy_wait  >  jiffy_elapsed     )     jiffy_wait = jiffy_wait    -  jiffy_elapsed         ;    else jiffy_wait = 1        ;    }