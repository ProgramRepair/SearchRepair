int test(int ret){
if ( ret  ==  -     ENOIOCTLCMD )     ret = compat_blkdev_driver_ioctl ( bdev       , mode       , cmd       , arg       )          ;    }