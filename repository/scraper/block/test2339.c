int test(int bio){
if ( bio_integrity_enabled ( bio       )     && bio_integrity_prep ( bio       )       )     { bio_endio ( bio       , -  EIO )    ;  return      ;  }    }