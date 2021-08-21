name := "scalaui"

organization := "it.lolgab"

version := "0.0.1"

scalaVersion := "2.13.6"

nativeLinkingOptions := Seq(s"-L${baseDirectory.value}/native-lib", "-v")

enablePlugins(ScalaNativePlugin)

//"/usr/bin/ld" -export-dynamic -z relro --hash-style=gnu --build-id --eh-frame-hdr -m elf_x86_64 -export-dynamic -dynamic-linker /lib64/ld-linux-x86-64.so.2
// -o /home/ed/dev-sn/scalaui-/target/scala-2.13/scalaui-out /usr/bin/../lib/gcc/x86_64-linux-gnu/10/../../../x86_64-linux-gnu/crt1.o
// /usr/bin/../lib/gcc/x86_64-linux-gnu/10/../../../x86_64-linux-gnu/crti.o /usr/bin/../lib/gcc/x86_64-linux-gnu/10/crtbegin.o
// -L/home/ed/dev-sn/scalaui-/native-lib -L/usr/bin/../lib/gcc/x86_64-linux-gnu/10 -L/usr/bin/../lib/gcc/x86_64-linux-gnu/10/../../../x86_64-linux-gnu
// -L/usr/bin/../lib/gcc/x86_64-linux-gnu/10/../../../../lib64 -L/lib/x86_64-linux-gnu -L/lib/../lib64 -L/usr/lib/x86_64-linux-gnu -L/usr/lib/../lib64
// -L/usr/lib/x86_64-linux-gnu/../../lib64 -L/usr/bin/../lib/gcc/x86_64-linux-gnu/10/../../.. -L/usr/lib/llvm-12/bin/../lib -L/lib -L/usr/lib
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/utime.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/netdb.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/limits.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/termios.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/sys/uio.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/sys/stat.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/sys/socket.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/sys/uname.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/sys/ioctl.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/sys/socket_conversions.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/sys/select.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/statvfs.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/unistd.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/dirent.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/syslog.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/grp.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/pwd.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/arpa/inet.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/pthread.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/time.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/fcntl.c.o
// /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/netinet/in.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/netinet/tcp.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/cpio.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-posixlib_native0.4_2.13-0.4.0-1/scala-native/errno.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/process_monitor.cpp.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/libunwind/UnwindRegistersSave.S.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/libunwind/UnwindRegistersRestore.S.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/libunwind/Unwind_AppleExtras.cpp.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/libunwind/Unwind-EHABI.cpp.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/libunwind/libunwind.cpp.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/libunwind/UnwindLevel1-gcc-ext.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/libunwind/UnwindLevel1.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/libunwind/Unwind-sjlj.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/shutdown.cpp.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/platform.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/unwind.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/eh.cpp.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/LargeAllocator.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/Marker.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/State.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/Object.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/StackTrace.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/Stats.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/Allocator.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/Heap.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/ImmixGC.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/Settings.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/BlockAllocator.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/datastructures/BlockList.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/datastructures/Bytemap.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/datastructures/Stack.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/gc/immix/Block.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/time_millis.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/time_nano.cpp.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-nativelib_native0.4_2.13-0.4.0-0/scala-native/dyndispatch.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-clib_native0.4_2.13-0.4.0-2/scala-native/math.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-clib_native0.4_2.13-0.4.0-2/scala-native/stdlib.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-clib_native0.4_2.13-0.4.0-2/scala-native/complex.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-clib_native0.4_2.13-0.4.0-2/scala-native/stdio.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-clib_native0.4_2.13-0.4.0-2/scala-native/float.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-clib_native0.4_2.13-0.4.0-2/scala-native/signal.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/native-code-clib_native0.4_2.13-0.4.0-2/scala-native/errno.c.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/4.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/8.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/11.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/3.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/7.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/2.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/9.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/6.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/1.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/10.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/5.ll.o /home/ed/dev-sn/scalaui-/target/scala-2.13/native/0.ll.o -lpthread -ldl -lui -lstdc++ -lm -lgcc_s -lgcc -lc -lgcc_s -lgcc /usr/bin/../lib/gcc/x86_64-linux-gnu/10/crtend.o /usr/bin/../lib/gcc/x86_64-linux-gnu/10/../../../x86_64-linux-gnu/crtn.o
