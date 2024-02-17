cd c++
mkdir build -p
cd creational
g++ -c singleton.cpp
g++ singleton.o -o singleton
rm singleton.o
mv singleton ../build/
cd ..
cd ..
