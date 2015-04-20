void test(int split, int sectors){
if ( bio_integrity ( split       )       )     bio_integrity_trim ( split       , 0       , sectors       )    ;    }