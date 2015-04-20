int test(int ioc, int iocontext_cachep, int free_ioc){
if ( free_ioc     )     kmem_cache_free ( iocontext_cachep       , ioc       )    ;    }