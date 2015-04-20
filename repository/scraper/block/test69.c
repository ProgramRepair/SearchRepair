void test(int bio, int bi, int WRITE){
if ( bio_data_dir ( bio       )    ==  WRITE     )     bio_integrity_process ( bio       , bi    -  >       generate_fn )    ;    }