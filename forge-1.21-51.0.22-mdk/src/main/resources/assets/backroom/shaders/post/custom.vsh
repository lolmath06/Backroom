#version 330 core
layout(location = 0) in vec3 inPosition;
layout(location = 1) in vec2 inUV;
layout(location = 2) in vec4 inColor;

uniform mat4 ModelViewProjectionMatrix;

out vec2 UV;
out vec4 VertexColor;

void main() {
    gl_Position = ModelViewProjectionMatrix * vec4(inPosition, 1.0);
    UV = inUV;
    VertexColor = inColor;
}
