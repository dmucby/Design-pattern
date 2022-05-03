echo "begin it ..."

git add .

git commit -m "$*"

echo $*

git push Design-pattern master

echo "finish it ..."