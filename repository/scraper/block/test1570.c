void test(int bio, int mapped_bio){
if ( unlikely ( bio_flagged ( bio       , BIO_BOUNCED       )         )       )     mapped_bio = bio    -  >        bi_private ;    }