int test(int mq_usage_counter){
if ( percpu_ref_tryget_live ( -    >  mq_usage_counter     )  )    return 0       ;    }