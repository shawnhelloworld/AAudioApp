#include <jni.h>
#include <string>
#include <aaudio/AAudio.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_aaudioapp_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C" JNIEXPORT jint JNICALL
Java_com_example_aaudioapp_MainActivity_AudioEngine(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return 1;
}